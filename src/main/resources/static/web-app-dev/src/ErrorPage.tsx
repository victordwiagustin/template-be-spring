import { useRouteError } from 'react-router-dom';

const ErrorPage = () => {
  const routeError: any = useRouteError();

  return (
    <div id={'error-page'}>
      <h1>Oops!</h1>
      <p>Sorry, an unexpected error has occurred.</p>
      <p>
        <i>{routeError.statusText || routeError.message}</i>
      </p>
    </div>
  );
};

export default ErrorPage;
