package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class GuidelinePageBlockLocation {
  /**
   * **BETA** The absolute url of the `GuidelinePageBlockLocation`.
   */
  @com.google.gson.annotations.SerializedName("url")
  private ch.brix.gql.client.frontify.scalars.UrlScalar url;
  /**
   * **BETA** `GuidelinePageBlockLocation` location path.
   */
  @com.google.gson.annotations.SerializedName("path")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.scalars.StringScalar.class)
  private java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar> path;
}
