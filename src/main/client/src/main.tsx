import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.tsx'
import { createBrowserRouter, RouterProvider } from 'react-router-dom'
import React from 'react'
import SchwimmenInfo from './pages/SchwimmenInfo.tsx'

const router = createBrowserRouter([
  {
    path: '/',
    element: <App />
  }, 
  {
    path:'/schwimmen',
    element: <SchwimmenInfo />
  }
]);

createRoot(document.getElementById('root')!).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>
)


 