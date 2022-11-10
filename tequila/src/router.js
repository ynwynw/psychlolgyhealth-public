import Vue from 'vue'
import Router from 'vue-router'

// import HelloWorld from './components/page/HelloWorld'
import LoginPage from './components/page/LoginPage'
import RegisterPage from './components/page/RegisterPage'
import UserLayout from './components/page/UserLayout'
import AdminLayout from './components/page/AdminLayout'
import BoardView from './components/board/BoardView'
import PostsView from './components/post/PostsView'
import DetailView from './components/post/DetailView'
import IntroView from './components/test/IntroView'
import TestView from './components/test/TestView'
import TalkView from './components/talk/TalkView'
import ProfileView from './components/user/ProfileView'
import UserSecurityView from './components/user/UserSecurityView'
import UserMessageView from './components/user/UserMessageView'
import View404 from './components/exception/View404'
import View500 from './components/exception/View500'
// admin
import UserView from './components/admin/user/UserView'
import UserAddView from './components/admin/user/UserAddView'
import AdminBoardView from './components/admin/board/AdminBoardView'
import AdminPostView from './components/admin/post/AdminPostView'
import AdminPostAddView from './components/admin/post/AdminPostAddView'
import AdminTalkView from './components/admin/talk/AdminTalkView'
import AdminTestView from './components/admin/test/AdminTestView'
import AdminTestResultView from './components/admin/test/AdminTestResultView'
import AdminChatView from './components/admin/chat/AdminChatView'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'index',
      redirect: '/board',
      component: UserLayout,
      children: [
        {
          path: '/board',
          component: BoardView
        },
        {
          path: '/posts',
          component: PostsView
        },
        {
          path: '/post/:id',
          component: DetailView,
          props: true
        },
        {
          path: '/test',
          component: TestView
        },
        {
          path: '/test/intro',
          component: IntroView
        },
        {
          path: 'talk',
          component: TalkView
        },
        {
          path: 'user',
          component: ProfileView
        },
        {
          path: 'user/security',
          component: UserSecurityView
        },
        {
          path: 'user/message',
          component: UserMessageView
        },
        {
          path: 'error404',
          name: '404',
          component: View404
        },
        {
          path: 'error500',
          name: '500',
          component: View500
        }
        
      ]
    },
    {
      path: '/admin',
      component: AdminLayout,
      redirect: '/admin/board',
      beforeEnter: (to, from, next) => {
        if (localStorage.userStatus == 999) {
          next()
        } else {
          next('/')
        }
      },
      children: [
        {
          path: 'user',
          component: UserView
        },
        {
          path: 'user/add',
          component: UserAddView
        },
        {
          path: 'board',
          component: AdminBoardView
        },
        {
          path: 'post',
          component: AdminPostView
        },
        {
          path: 'post/add',
          component: AdminPostAddView
        },
        {
          path: 'talk',
          component: AdminTalkView
        },
        {
          path: 'test',
          component: AdminTestView
        },
        {
          path: 'test/result',
          component: AdminTestResultView
        },
        {
          path: 'chat',
          name: 'adminChat',
          component: AdminChatView
        }
      ]
    },
    {
      path: '/login',
      name: 'login',
      component: LoginPage
    },
    {
      path: '/register',
      name: 'register',
      component: RegisterPage
    }
    // {
    //   path: '/about',
    //   name: 'about',
    //   // route level code-splitting
    //   // this generates a separate chunk (about.[hash].js) for this route
    //   // which is lazy-loaded when the route is visited.
    //   component: () => import(/* webpackChunkName: "about" */ './views/About.vue')
    // }
  ]
})