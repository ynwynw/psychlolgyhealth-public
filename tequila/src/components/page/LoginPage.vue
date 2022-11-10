<template>
  <div class="main">
    <a-row :gutter="24">
      <a-col :span="8" :offset="8">
        <div class="title">CPCP 高校心理咨询平台</div>
        <div class="label">登录</div>
        <a-form id="formLogin" class="user-layout-login" ref="formLogin">
          <a-alert
            v-if="isLoginError"
            type="error"
            showIcon
            style="margin-bottom: 24px;"
            message="用户名或密码错误"
          />
          <a-form-item>
            <a-input
              size="large"
              type="text"
              placeholder="用户名"
              v-model="inputUsername"
              v-decorator="[
                'username',
                {
                  rules: [
                    { required: true, message: '请输入帐户名或邮箱地址' },
                    { validator: handleUsernameOrEmail }
                  ],
                  validateTrigger: 'change'
                }
              ]"
            >
              <a-icon
                slot="prefix"
                type="user"
                :style="{ color: 'rgba(0,0,0,.25)' }"
              />
            </a-input>
          </a-form-item>

          <a-form-item>
            <a-input
              size="large"
              type="password"
              autocomplete="false"
              placeholder="密码"
              v-model="inputPassword"
              v-decorator="[
                'password',
                {
                  rules: [{ required: true, message: '请输入密码' }],
                  validateTrigger: 'blur'
                }
              ]"
            >
              <a-icon
                slot="prefix"
                type="lock"
                :style="{ color: 'rgba(0,0,0,.25)' }"
              />
            </a-input>
          </a-form-item>

          <a-form-item>
            <a-checkbox v-decorator="['rememberMe']">自动登录</a-checkbox>
            <router-link
              class="register"
              :to="{ name: 'register'}"
              style="float: right;"
              >注册账户</router-link
            >
          </a-form-item>

          <a-form-item style="margin-top:24px">
            <a-button
              size="large"
              type="primary"
              class="login-button"
              :loading="state.loginBtn"
              :disabled="state.loginBtn"
              @click="doLogin"
              >登录</a-button
            >
          </a-form-item>
        </a-form>
      </a-col>
    </a-row>
  </div>
</template>

<script>
import api from '@/api/index'
import axios from "axios";
export default {
  data() {
    return {
      inputUsername: "",
      inputPassword: "",
      customActiveKey: "tab1",
      loginBtn: false,
      // login type: 0 email, 1 username, 2 telephone
      loginType: 0,
      isLoginError: false,
      state: {
        time: 60,
        loginBtn: false,
        // login type: 0 email, 1 username, 2 telephone
        loginType: 0,
        smsSendBtn: false
      }
    };
  },
  created() {},
  methods: {
    // handler
    handleUsernameOrEmail(rule, value, callback) {
      const { state } = this;
      const regex = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
      if (regex.test(value)) {
        state.loginType = 0;
      } else {
        state.loginType = 1;
      }
      callback();
    },
    handleTabClick(key) {
      this.customActiveKey = key;
    },
    doLogin() {
      axios
        .post(api.Login, {
          username: this.inputUsername,
          password: this.inputPassword
        })
        .then(response => {
          var code = response.data.code;
          if (code == 1) {
            localStorage.token = response.data.data.jws
            localStorage.userId = response.data.data.userId
            localStorage.username = response.data.data.username
            localStorage.userStatus = response.data.data.status 
            this.$router.push({ path: "/" });
            // 延迟 1 秒显示欢迎信息
            setTimeout(() => {
              this.$notification.success({
                message: "欢迎",
                description: `欢迎回来`
              });
            }, 1000);
            this.isLoginError = false;
          } else if (code == 0) {
            this.isLoginError = true;
            // do something
          }
        })
        .catch(error => {
          this.isLoginError = true;
          this.$notification["error"]({
            message: "错误",
            description:
              ((error.response || {}).data || {}).message ||
              "请求出现错误，请稍后再试",
            duration: 4
          });
        });
    }
  }
};
</script>

<style lang="less" scoped>
.user-layout-login {
  label {
    font-size: 14px;
  }

  .getCaptcha {
    display: block;
    width: 100%;
    height: 40px;
  }

  .forge-password {
    font-size: 14px;
  }

  button.login-button {
    padding: 0 15px;
    font-size: 16px;
    height: 40px;
    width: 100%;
  }

  .user-login-other {
    text-align: left;
    margin-top: 24px;
    line-height: 22px;

    .item-icon {
      font-size: 24px;
      color: rgba(0, 0, 0, 0.2);
      margin-left: 16px;
      vertical-align: middle;
      cursor: pointer;
      transition: color 0.3s;

      &:hover {
        color: #1890ff;
      }
    }

    .register {
      float: right;
    }
  }
}
.main {
  margin: 150px 0;
}
.title {
  font-size: 28px;
  color: rgba(0, 0, 0, 0.85);
  font-weight: 700;
  margin-bottom: 24px;
}

.label {
  font-size: 24px;
  color: rgba(0, 0, 0, 0.85);
  font-weight: 500;
  margin-bottom: 16px;
}
</style>
