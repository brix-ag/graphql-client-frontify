package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class GuidelineDocumentPageCategoryNavigationItem {
  /**
   * **BETA**
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
  /**
   * **BETA**
   */
  @com.google.gson.annotations.SerializedName("url")
  private ch.brix.gql.client.frontify.scalars.StringScalar url;
  /**
   * **BETA**
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA**
   */
  @com.google.gson.annotations.SerializedName("children")
  private ch.brix.gql.client.frontify.objects.GuidelineDocumentPageCategoryChildrenItems children;
}
