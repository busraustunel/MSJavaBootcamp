import logo from './logo.svg';
import './App.css';
import {BrowserRouter, Route, Routes} from "react-router-dom";
import {CategoryList} from "./components/CategoryList";

function App() {
  return (
      <div className="App">
        <BrowserRouter>
          <Routes>
            <Route path={"/"} element={<CategoryList/>}/>
            <Route path={"/checkout"} element={<CategoryList/>}/>
          </Routes>
        </BrowserRouter>
      </div>
  );
}

export default App;
