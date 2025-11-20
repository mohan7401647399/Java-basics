import { useEffect, useState } from 'react'
import TodoForm from './components/TodoForm'
import axios from 'axios';
import TodoLists from './components/TodoLists';

const App = () => {
  const [todos, setTodos] = useState([]);
  const [editId, setEditId] = useState(null);
  const [editName, setEditName] = useState("");

  //  backend API
  const API_URL = "http://localhost:8080/api/todo";

  // fetch data
  const fetchTodo = async () => {
    try {
      const res = await axios.get(`${API_URL}/alltodo`);
      setTodos(Array.isArray(res.data) ? res.data : []);
    } catch (error) {
      console.error(error);
      setTodos([]);
    }
  }

  //  refresh the data when site loading
  useEffect(() => {
    fetchTodo();
  }, []);

  //  create
  const addTodo = async (name) => {
    if (!name.trim()) return;
    await axios.post(`${API_URL}/create`, { name, completed: false });
    fetchTodo();
  }

  // update
  const updateTodo = async (id, name, completed) => {
    await axios.put(`${API_URL}/update/${id}`, { name, completed });
    setEditId(null);
    setEditName("");
    fetchTodo();
  }

  //  delete
  const deleteTodo = async (id) => {
    await axios.delete(`${API_URL}/delete/${id}`);
    fetchTodo();
  }

  return (
    <div className="min-h-screen flex justify-center items-center bg-gray-900">
      <div className="max-w-md w-full space-y-6">
        <div className="bg-white p-8 rounded shadow-lg">
          <h1 className="text-2xl font-bold text-center mb-4">Todo App</h1>

          {/* Form Component */}
          <TodoForm onAdd={ addTodo } />

          {/* List Component */}
          <TodoLists todos={ todos } editId={ editId } editName={ editName } setEditId={ setEditId } setEditName={ setEditName } onUpdate={ updateTodo } onDelete={ deleteTodo } />

        </div>
      </div>
    </div>
  )
}

export default App
