import React from "react";
import { RouterProvider } from "react-router";
import { createBrowserRouter } from "react-router-dom";
import "./App.css";
import Layout from "./components/layout/Layout";
import Main from "./components/main/Main";

const router = createBrowserRouter([
  {
    path: "/",
    element: <Layout />,
    children: [
      {
        index: true,
        element: <Main />,
      },
    ],
  },
]);

function App() {
  return (
    <div className="App">
      <RouterProvider router={router} />
    </div>
  );
}

export default App;
