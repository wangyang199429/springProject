<template>
    <div>
        
        <!--顶部返回组件-->
        <detail-header :videoInfo="videoInfo"></detail-header>

        <!--视频介绍组件-->
        <detail-course :videoInfo="videoInfo"></detail-course>

        <!--视频tab简介组件-->
        <!-- <detail-tab></detail-tab> -->

        <!--底部立刻购买-->
        <footer></footer> 

    </div>
</template>

<script>
//引入组件
import DetailHeader from './Components/Header'
import DetailCourse from './Components/Course'
import DetailTab from './Components/Tab'

import { getVideoDetail } from "@/api/getData.js";


export default {
    //注册组件
    components:{
        DetailHeader,
        DetailCourse,
        DetailTab
    },

    data(){
        return {
            //视频信息
            videoInfo:{},
            //章集
            chapterList:[]
        }
    },

    methods:{
        //获取视频详情
        async getDetail(vid){
            try{
               const result =  await getVideoDetail(vid)
               if(result.data.code == 0){
                   this.videoInfo = result.data.data;
                   this.chapterList = result.data.data.chapter_list;
               }

            }catch(error){
                console.log(error)
            }
        }
    },

    mounted(){
        //渲染完成后拿数据
        console.log(this.$route.query.video_id)
        this.getDetail(this.$route.query.video_id);

    }
}
</script>

<style lang="scss" scoped>

</style>