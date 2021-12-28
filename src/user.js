import axios from "axios";

const BASE_URL = "http://localhost:8080";

export const getUserList = () => {
  return axios.get(BASE_URL + "/user/getAll");
};

export const getUserById = (userId) => {
  return axios.get(BASE_URL + "/user/get/" + userId);
};