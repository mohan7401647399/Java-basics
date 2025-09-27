import TodoItem from "./TodoItem"

const TodoLists = ({ todos, editId, editName, setEditId, setEditName, onUpdate, onDelete }) => {
  return (
    <ul className="space-y-3">
      { todos.map((todo) => (
        <TodoItem
          key={ todo.id }
          todo={todo}
          editId={ editId }
          editName={ editName }
          setEditId={ setEditId }
          setEditName={ setEditName }
          onUpdate={ onUpdate }
          onDelete={ onDelete }
        />
      )) }
    </ul>
  )
}

export default TodoLists
