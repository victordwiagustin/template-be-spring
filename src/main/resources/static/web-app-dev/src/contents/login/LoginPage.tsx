import React, { useState } from 'react';
import InputLabel from '../../components/InputLabel';
import InputText from '../../components/InputText';

interface Props {

}

const LoginPage = (props: Props) => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  const handleChangeUsername = (evt: React.ChangeEvent<HTMLInputElement>) => {
    const value = evt.target.value;
    setUsername(value);
  }

  const handleChangePassword = (evt: React.ChangeEvent<HTMLInputElement>) => {
    const value = evt.target.value;
    setPassword(value);
  }

  return (
    <div className='LoginContainer bg-yellow-200'>
      <div className={'w-full max-w-xs mx-auto py-2'}>
        <form className="bg-white shadow-md rounded px-8 pt-6 pb-8 mb-4 self-center">
          <div className="mb-4">
            <InputLabel>
              Username
            </InputLabel>
            <InputText
              value={username}
              onChange={handleChangeUsername}
            />
          </div>
          <div className='mb-6'>
            <InputLabel>
              Password
            </InputLabel>
            <InputText
              typePassword
              value={password}
              onChange={handleChangePassword} 
            />
          </div>
        </form>
      </div>
    </div>
  )
}

export default LoginPage;