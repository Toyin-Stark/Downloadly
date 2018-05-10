package ng.canon.downloadly

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import ng.canon.downloadly.Tabs.Muse
import ng.canon.downloadly.Tabs.PhotoBucket
import ng.canon.downloadly.Tabs.ViewPagerAdapter

class MainActivity : AppCompatActivity() {
    private val tabIcons = intArrayOf(R.drawable.ic_home,R.drawable.ic_save)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setupViewPager(viewpager);
        tabs.setupWithViewPager(viewpager)
        setupTabIcons()
    }



    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(Muse(), "")
        adapter.addFragment(PhotoBucket(), "")
        viewPager.adapter = adapter
    }


    private fun setupTabIcons() {
        tabs.getTabAt(0)!!.setIcon(tabIcons[0])
        tabs.getTabAt(1)!!.setIcon(tabIcons[1])

    }

}
