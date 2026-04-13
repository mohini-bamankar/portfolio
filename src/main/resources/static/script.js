function showSection(id) {
    let sections = document.querySelectorAll(".tab-section");
    sections.forEach(sec => sec.classList.remove("active"));
    document.getElementById(id).classList.add("active");
}

/* 🌙 DARK MODE */
function toggleTheme() {
    document.body.classList.toggle("light-mode");
}

/* 🔥 SHOW PROJECT DETAILS */
function showDetails(details) {

    let box = document.getElementById("projectDetails");

    box.style.display = "block";

    box.innerText = details;

    box.scrollIntoView({ behavior: "smooth" });
}
