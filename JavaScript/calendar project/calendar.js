const button = document.getElementById("make");

button.addEventListener("click", function () {

    const year = Number(document.getElementById("year").value);
    const month = Number(document.getElementById("month").value);
    const day = Number(document.getElementById("day").value);

    const table = document.getElementById("calendar");

    // 删除旧日历（保留星期）
    while (table.rows.length > 1) {
        table.deleteRow(1);
    }

    // 本月第一天
    const firstWeek = new Date(year, month - 1, 1).getDay();

    // 本月最后一天
    const lastDay = new Date(year, month, 0).getDate();

    let currentDay = 1;

    // 最多 6 行
    for (let week = 0; week < 6 && currentDay <= lastDay; week++) {

        const row = document.createElement("tr");

        for (let i = 0; i < 7; i++) {

            const cell = document.createElement("td");

            // 第一周前面的空白
            if (week === 0 && i < firstWeek) {
                cell.textContent = "";
            }
            // 月末后面的空白
            else if (currentDay > lastDay) {
                cell.textContent = "";
            }
            else {

                cell.textContent = currentDay;

                if (currentDay === day) {
                    cell.classList.add("selected");
                }

                currentDay++;
            }

            row.appendChild(cell);
        }

        table.appendChild(row);
    }

});
