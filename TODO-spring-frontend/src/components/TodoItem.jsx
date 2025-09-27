
const TodoItem = ({ todo, editId, editName, setEditId, setEditName, onUpdate, onDelete }) => {

  const handleToggle = () => {
    onUpdate(todo.id, todo.name, !todo.completed);
  }

  return (
    <li className="flex justify-between items-center border rounded-lg p-3">
      {
        editId === todo.id ? (
          <>
            <input type="text" value={ editName } onChange={ (e) => setEditName(e.target.value) } className="flex-1 border rounded-lg px-2 py-1 mr-2" />
            <button onClick={ () => onUpdate(todo.id, editName) } className="bg-green-500 text-white px-3 py-1 rounded-lg hover:bg-green-600">Save</button>
            <button onClick={ () => setEditId(null) } className="bg-gray-400 text-white px-3 py-1 rounded-lg hover:bg-gray-500 ml-2">Cancel</button>
          </>
        ) : (
          <>
            <div className="flex items-center gap-2">
              <input type="checkbox" checked={ todo.completed } onChange={ handleToggle } className="w-4 h-4" />
              <span className={ todo.completed ? "line-through text-gray-400" : "" }>{ todo.name }</span>
            </div>
            <div className="flex gap-2">
              <button onClick={ () => {
                setEditId(todo.id);
                setEditName(todo.name);
              } }
                className="bg-yellow-500 text-white px-3 py-1 rounded-lg hover:bg-yellow-600">Edit</button>
              <button onClick={ () => onDelete(todo.id) } className="bg-red-500 text-white px-3 py-1 rounded-lg hover:bg-red-600">Delete</button>
            </div>
          </>
        )
      }
    </li>
  )
}

export default TodoItem
