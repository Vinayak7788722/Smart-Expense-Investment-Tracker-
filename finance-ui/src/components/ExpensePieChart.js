import { useEffect, useState } from "react";
import axios from "axios";
import { Pie } from "react-chartjs-2";
import {
  Chart as ChartJS,
  ArcElement,
  Tooltip,
  Legend
} from "chart.js";

ChartJS.register(ArcElement, Tooltip, Legend);

export default function ExpensePieChart() {

  const [data, setData] = useState(null);

  useEffect(() => {
    axios.get("http://localhost:8080/expenses/category-summary")
      .then(res => {
        const apiData = res.data.data;

        const chartData = {
          labels: apiData.map(i => i.category),
          datasets: [
            {
              data: apiData.map(i => i.totalAmount)
            }
          ]
        };

        setData(chartData);
      })
      .catch(err => console.error(err));
  }, []);

  return (
    <div className="chart-container">
  <div className="chart-title">Expense Distribution</div>

  <div style={{ height: "300px" }}>
    {data && <Pie data={data} options={{ maintainAspectRatio: false }} />}
  </div>
</div>
  );
}