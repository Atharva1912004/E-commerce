import React, { useEffect, useState } from 'react';
import { useParams, useNavigate } from 'react-router-dom';
import axios from 'axios';
import '../App.css';

const ProductDetailsPage = () => {
  const { id } = useParams();
  const navigate = useNavigate();
  const [product, setProduct] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    axios
      .get(`http://localhost:8080/products/${id}`)
      .then((res) => {
        setProduct(res.data);
        setLoading(false);
      })
      .catch(() => {
        setError("There was an error fetching the product details.");
        setLoading(false);
      });
  }, [id]);

  if (loading) return <p className="text-center mt-10">Loading...</p>;
  if (error) return <p className="text-center text-red-500 mt-10">{error}</p>;

  return (
    <div className="details-container">
      <div className="back-button" onClick={() => navigate('/')}>← Back to Search</div>
      <img src={product.imageUrl} alt={product.name} />
      <h1>{product.name}</h1>
      <p><strong>Description:</strong> {product.description}</p>
      <p><strong>Brand:</strong> {product.brand}</p>
      <p><strong>Category:</strong> {product.category}</p>
      <p style={{ fontSize: '1.5rem', color: '#27ae60', fontWeight: 'bold' }}>
        ${product.price.toFixed(2)}
      </p>

      <button
        className="buy-button"
      >
        Buy Now
      </button>
    </div>
  );
};

export default ProductDetailsPage;
