import React from 'react';
import Home from '../Home';
import Photos from '../Photos';
import Blogs from '../Blogs';
import AboutOwner from '../AboutOwner';

var routerMap = {
		"/index.html":<Home />,
		"/photos.html":<Photos />,
		"/blogs.html":<Blogs />,
		"/about.html":<AboutOwner />
		}

class Router extends React.Component{
	render(){
		var pathName = window.document.location.pathname;
		return routerMap[pathName] || <Home />;
	}
}
export default Router;
