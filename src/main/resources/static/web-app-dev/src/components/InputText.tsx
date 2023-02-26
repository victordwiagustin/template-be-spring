import React from 'react';

type Ref = HTMLInputElement;

interface Props {
  value: string;
  typePassword?: boolean;
  onChange: (event: React.ChangeEvent<HTMLInputElement>) => void;
  onClick?: (event: React.MouseEvent<HTMLInputElement>) => void;
  // onClick(event: React.MouseEvent<HTMLButtonElement>): void;
}

const InputText = React.forwardRef<Ref, Props>((props, ref) => {
  const { value, typePassword, onChange, onClick } = props;

  return (
    <input
      type={typePassword ? 'password' : 'text'}
      ref={ref}
      className={'shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline'}
      value={value}
      onClick={onClick}
      onChange={onChange}
    />
  );
});

export default InputText;
