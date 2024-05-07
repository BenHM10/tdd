[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/zgOQAhkf)
# 10_IntegrationTestMockito
Perhatikan kode SUT berikut ini

    public class UserServiceImpl {
    
        private UserDAO userDAO;
    
        private SecurityService securityService;
    
        public void assignPassword(User user) throws Exception {
    
            String passwordMd5 = securityService.md5(user.getPassword());
    
            user.setPassword(passwordMd5);
    
            userDAO.updateUser(user);
    
        }
    
        public UserServiceImpl(UserDAO dao, SecurityService security) {
    
            this.userDAO = dao;
    
            this.securityService = security;
    
        }
    
    }
1. Buatlah interface untuk setiap DOC yang dibutuhkan untuk dapat menguji SUT.
3. Buatlah test untuk memverifikasi jika object user berhasil mendapatkan password barunya 
4. Buatlah test untuk memverifikasi jika method updateUser() pada userDAO dipanggil dengan benar.

