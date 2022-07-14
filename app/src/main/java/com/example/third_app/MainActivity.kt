package com.example.third_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.third_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // 전역 변수로 바인딩 객체 선언
    private var mBinding : ActivityMainBinding?= null
    // 매번 null 체크 할 필요 없도록 바인딩 변수 재선언
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 자동 생성된 뷰 바인딩 클래스에서 액티비티에서 사용할 바인딩 클래스 인스턴스 생성
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        // 최상위 위치 뷰의 인스턴스를 통해 액티비티에 뷰 표시
        setContentView(binding.root)


    }

    // 액티비티가 파괴될 때
    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}
