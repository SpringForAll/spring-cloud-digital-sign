/**
 * @file upload-doc.vue
 * @author liumapp
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 7/18/18
 */
<template>
  <div>
    <br>
    <Row>
      <Col span="8" offset="8">
      <Upload
        multiple="false"
        type="drag"
        action="#"
        accept=".doc, .docx, .pdf"
        :before-upload="handleFileToBase64"
        :default-file-list="readyUploadFile"
        :on-remove="handleRmFile">
        <div style="padding: 20px 0">
          <Icon type="ios-cloud-upload" size="52" style="color: #3399ff"></Icon>
          <p>Click or drag files here to upload</p>
        </div>
      </Upload>
      </Col>
    </Row>
    <Row>
      <Col span="2" offset="14">
      <Button type="primary" @click="submitPic">提交</Button>
      </Col>
    </Row>
  </div>
</template>
<script>
import util from '@/libs/util'
export default {
  name: 'upload-doc'
}
</script>
