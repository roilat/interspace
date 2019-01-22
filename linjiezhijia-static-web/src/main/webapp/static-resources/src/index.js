import React from 'react';
import ReactDOM from 'react-dom';
import Header from './page/common/Header';
import Router from './page/common/Router';


ReactDOM.render(
  (<Header />),
  document.getElementsByTagName("header")[0]
);

ReactDOM.render(
  (<Router />),
  document.getElementsByTagName("article")[0]
);