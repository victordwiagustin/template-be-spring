import { Outlet, Link } from 'react-router-dom';

function Root() {
  return (
    <div className='RootContainer'>
      Root Container
      <nav>
        <ul>
          <li>
            {/* <a href={`/contacts/1`}>Your Name</a> */}

            {/* using client side routing */}
            <Link to={`contacts/1`}>Your Name</Link>
          </li>
          <li>
            {/* <a href={`/contacts/2`}>Your Friend</a> */}

            {/* using client side routing */}
            <Link to={`contacts/1`}>Your Name</Link> 
          </li>
        </ul>
      </nav>

      <div id="detail">
        <Outlet />
      </div>
    </div>
  );
}

export default Root;