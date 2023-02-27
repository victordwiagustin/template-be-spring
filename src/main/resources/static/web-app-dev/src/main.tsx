import React from 'react';
import ReactDOM from 'react-dom/client';
import { createBrowserRouter, RouterProvider } from 'react-router-dom';
import ErrorPage from './ErrorPage';
// import App from './App';
import './index.css';
import Contact from './routes/Contact';
import Root from './routes/Root';

const router = createBrowserRouter([
  {
    path: '/',
    element: <Root />,
    errorElement: <ErrorPage />,
    // loader: rootLoader, // TODO: create loader + useLoaderData https://reactrouter.com/en/main/start/tutorial#client-side-routing
    children: [
      // children path with outlet
      {
        path: 'contacts/:contactId',
        element: <Contact />
      }
    ]
  },
  // another path
]);

ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
  <React.StrictMode>
    {/* <App /> */}
    <RouterProvider router={router} />
  </React.StrictMode>
);
