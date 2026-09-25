package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class GuidelineContentSearchResult {
  /**
   * **BETA** The guideline content that matched.
   */
  @com.google.gson.annotations.SerializedName("content")
  private ch.brix.gql.client.frontify.unions.GuidelineContentSearchResultContent content;
}
