import usuarios from '../users.js';
import manageUsers from './manageUsers.js';
window.addEventListener('DOMContentLoaded', function() {
    manageUsers.showAllUsers(usuarios);
    manageUsers.showUsersGender(usuarios, "M");
});