import { createBrowserRouter } from 'react-router-dom';
import {FirstView} from "Frontend/views/FirstView.js";

const router = createBrowserRouter([
            { path: '/', element: <FirstView/>},
            ]);

export default router;
