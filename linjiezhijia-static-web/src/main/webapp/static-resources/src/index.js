import React from 'react';
import ReactDOM from 'react-dom';
import Header from './page/common/Header';
import Body from './page/common/Body';

ReactDOM.render(
  (<Header />),
  document.getElementById("nav")
);
	
ReactDOM.render(
  (<Body />),
  document.getElementById("aboutMe")
);