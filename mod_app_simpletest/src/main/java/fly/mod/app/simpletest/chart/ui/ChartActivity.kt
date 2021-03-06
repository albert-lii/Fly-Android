package fly.mod.app.simpletest.chart.ui

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import fly.mod.app.simpletest.R
import fly.mod.app.simpletest.databinding.StActivityChartBinding
import fly.mod.lib.common.base.BaseAppBindingActivity
import fly.mod.lib.common.router.RouteConstants
import fly.mod.lib.common.router.RouterUtils
import org.we.fly.extensions.singleClick

/**
 * @author: Albert Li
 * @contact: albertlii@163.com
 * @time: 2021/3/19 2:44 PM
 * @description: 图表测试入口
 * @since: 1.0.0
 */
@Route(path = RouteConstants.PAGE_ST_CHART)
class ChartActivity : BaseAppBindingActivity<StActivityChartBinding>() {

    override fun getLayoutId(): Int {
        return R.layout.st_activity_chart
    }

    override fun initialize(savedInstanceState: Bundle?) {
        addListener()
    }

    private fun addListener() {
        binding.btn1.singleClick {
            RouterUtils.getInstance()
                .navigate(this@ChartActivity, RouteConstants.PAGE_ST_CHART_CURVE)
        }
        binding.btn2.singleClick {
            RouterUtils.getInstance()
                .navigate(this@ChartActivity, RouteConstants.PAGE_ST_CHART_PROGRESSCELL)
        }
    }
}