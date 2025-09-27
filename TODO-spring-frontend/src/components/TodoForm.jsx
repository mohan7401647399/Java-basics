import { useState } from "react"

const TodoForm = ({ onAdd }) => {
  const [todoText, setTodoText] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    onAdd(todoText);
    setTodoText("");
  }

  return (
    <form onSubmit={ handleSubmit } className="flex gap-2 mb-4">
      <input type="text" className="flex-1 border rounded-lg px-3 py-2" value={todoText} onChange={(e) => setTodoText(e.target.value)}/>
      <button type="submit" className="bg-blue-500 text-white px-4 py-2 rounded-lg hover:bg-blue-600">Add Task</button>
    </form>
  )
}

export default TodoForm
