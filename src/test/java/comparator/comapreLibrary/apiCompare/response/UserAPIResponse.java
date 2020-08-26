package comparator.comapreLibrary.apiCompare.response;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserAPIResponse {
	
	 	@SerializedName("page")
	    @Expose
	    public Integer page;
	    @SerializedName("per_page")
	    @Expose
	    public Integer perPage;
	    @SerializedName("total")
	    @Expose
	    public Integer total;
	    @SerializedName("total_pages")
	    @Expose
	    public Integer totalPages;
	/*    @SerializedName("data")
	    @Expose
	    //public List<Datum> data = null;
	    public Datum data;*/
	    @SerializedName("ad")
	    @Expose
	    public Ad ad;
	    
	    
	    public Integer getPage() {
	        return page;
	    }

	    public void setPage(Integer page) {
	        this.page = page;
	    }

	    public Integer getPerPage() {
	        return perPage;
	    }

	    public void setPerPage(Integer perPage) {
	        this.perPage = perPage;
	    }

	    public Integer getTotal() {
	        return total;
	    }

	    public void setTotal(Integer total) {
	        this.total = total;
	    }

	    public Integer getTotalPages() {
	        return totalPages;
	    }

	    public void setTotalPages(Integer totalPages) {
	        this.totalPages = totalPages;
	    }

//	    public List<Datum> getData() {
//	        return data;
//	    }
//
//	    public void setData(List<Datum> data) {
//	        this.data = data;
//	    }
	    
	/*    public Datum getData() {
	        return data;
	    }

	    public void setData(Datum data) {
	        this.data = data;
	    }*/

	    public Ad getAd() {
	        return ad;
	    }

	    public void setAd(Ad ad) {
	        this.ad = ad;
	    }


}
