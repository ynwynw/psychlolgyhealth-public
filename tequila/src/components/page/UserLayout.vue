<template>
  <a-layout id="user-layout" class="layout">
    <a-layout-header>
      <a-menu
        v-model="current"
        mode="horizontal"
        theme="dark"
        :style="{ lineHeight: '64px' }"
      >
        <a-menu-item><Logo title="高校心理咨询平台" /> </a-menu-item>

        <a-menu-item key="board">
          <router-link to="/board"
            ><a-icon type="notification" /> 公告
          </router-link>
        </a-menu-item>

        <a-menu-item key="posts">
          <router-link to="/posts"><a-icon type="read" /> 文章 </router-link>
        </a-menu-item>

        <a-menu-item key="test">
          <router-link to="/test/intro">
            <a-icon type="project" /> 在线测评</router-link
          >
        </a-menu-item>

        <a-menu-item key="talk">
          <router-link to="/talk"
            ><a-icon type="file-text" /> 留言板</router-link
          >
        </a-menu-item>

        <a-menu-item key="profile">
          <router-link to="/user"> <a-icon type="user" />个人中心</router-link>
        </a-menu-item>

        <a-menu-item key="dashboard" v-show="showAdmin">
          <router-link to="/admin">
            <a-icon type="project" />后台管理</router-link
          >
        </a-menu-item>

        <a-menu-item style="float: right" @click="logout">
          <a-icon type="logout" />退出
        </a-menu-item>
      </a-menu>
    </a-layout-header>
    <a-layout-content style="margin: 48px 0 0 0">
      <a-row>
        <a-col :md="{ span: 16, offset: 4 }" :xs="{ span: 20, offset: 2 }">
          <div
            :style="{ background: '#fff', padding: '24px', minHeight: '600px' }"
          >
            <router-view></router-view>
          </div>
        </a-col>
      </a-row>
    </a-layout-content>
    <a-layout-footer style="text-align: center">
      高校心理咨询平台
    </a-layout-footer>
  </a-layout>
</template>
<script>
import Logo from '../Logo'
export default {
  components: { Logo },
  data() {
    return {
      current: [''],
      username: localStorage.username,
      showAdmin: false,
    }
  },
  mounted() {
    this.showAdmin = localStorage.userStatus == 999 ? true : false
  },
  methods: {
    logout() {
      localStorage.clear()
      this.$router.push({ path: '/login' })
    },
  },
}
</script>
<style>
.title {
  font-size: 20px;
  color: rgba(0, 0, 0, 0.85);
  font-weight: 500;
  margin-bottom: 16px;
}

.main {
  font-size: 16px;
  margin: 0 8px;
  line-height: 1.75em;
}

.appendix {
  font-size: 14px;
  width: 100%;
  color: rgba(0, 0, 0, 0.55);
  font-weight: 500;
  margin: 16px 0;
}
</style>
