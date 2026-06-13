import axios from 'axios';

const API_URL = 'http://localhost:8080/api/game';

export const startGame = async () => {
  const res = await axios.post(`${API_URL}/start`);
  return res.data;
};

export const makeMove = async (position) => {
  const res = await axios.post(`${API_URL}/move`, { position });
  return res.data;
};

export const resetGame = async () => {
  const res = await axios.post(`${API_URL}/reset`);
  return res.data;
};