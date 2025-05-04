import axios from 'axios';
const API_BASE='http://localhost:8080';

export const fetchProducts = (search= '')=>
  axios.get(`${API_BASE}/products`,{params:{search}});
export const fetchProductById=(id) =>
  axios.get(`${API_BASE}/prodcuts/${id}`);