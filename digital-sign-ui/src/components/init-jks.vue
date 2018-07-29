/**
 * @file init-jks.vue
 * @author liumapp
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 7/23/18
 */
<template>
  <Form ref="initKsForm" :model="checkMsgForm" :rules="checkMsgRule">
    <FormItem label="用户名" prop="name">
      <Input type="text" v-model="checkMsgForm.name"></Input>
    </FormItem>
    <FormItem label="年龄" prop="age">
      <Input type="text" v-model="checkMsgForm.age" number></Input>
    </FormItem>
    <FormItem label="头像" prop="headPic">
      <SingleImgUpload id="head-pic-upload"
                       :uploadUrl="uploadUrl"
                       @imgInfo="handlePic" ></SingleImgUpload>
    </FormItem>
    <FormItem>
      <Button type="primary" @click="handleSubmit('checkMsgForm')">Submit</Button>
      <Button type="ghost" @click="handleReset('checkMsgForm')">Reset</Button>
    </FormItem>
  </Form>
</template>
<script>
import util from '@/libs/util'
export default {
  name: 'init-jks',
  data () {
    return {
      initKsForm: {
        name: 'KeyStore Name',

      }
    }
  },
}
</script>
