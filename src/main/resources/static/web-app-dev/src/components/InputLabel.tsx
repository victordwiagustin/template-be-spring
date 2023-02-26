import React, { PropsWithChildren } from 'react';

function InputLabel(props: PropsWithChildren) {
  return (
    <label className={'block text-gray-700 text-sm font-bold mb-2'}>
      {props.children}
    </label>
  );
}

export default InputLabel;