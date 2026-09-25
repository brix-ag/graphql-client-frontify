package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class GuidelineContentSearchItems {
  /**
   * **BETA** The results, in the order the search engine ranked them, which is the order they are meant to be shown in.
   */
  @com.google.gson.annotations.SerializedName("items")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.GuidelineContentSearchResult.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.GuidelineContentSearchResult> items;
  /**
   * **BETA** Whether the search engine holds results beyond the requested page.
   */
  @com.google.gson.annotations.SerializedName("hasNextPage")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar hasNextPage;
}
