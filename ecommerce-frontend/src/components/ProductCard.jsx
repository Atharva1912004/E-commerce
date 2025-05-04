import React from 'react';
import { useNavigate } from 'react-router-dom';

const ProductCard = ({ product }) => {
  const navigate = useNavigate();

  return (
    <div className="product-item" onClick={() => navigate(`/product/${product.id}`)}>
      <img src={product.imageUrl} alt={product.name} />
      <h3>{product.name}</h3>
      <p>${product.price.toFixed(2)}</p>
      <p style={{ fontSize: '0.9em', color: '#555' }}>{product.brand} • {product.category}</p>
    </div>
  );
};

export default ProductCard;
