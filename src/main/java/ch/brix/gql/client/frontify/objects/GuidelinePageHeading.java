package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class GuidelinePageHeading {
  /**
   * **BETA** `GuidelinePageHeading` id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** `GuidelinePageHeading` title.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
  /**
   * **BETA** `GuidelinePageHeading` url.
   */
  @com.google.gson.annotations.SerializedName("url")
  private ch.brix.gql.client.frontify.scalars.UrlScalar url;
  /**
   * **BETA** The timestamp of the most recent modification to the `GuidelinePageHeading`. If not modified, this represents the creation time.
   */
  @com.google.gson.annotations.SerializedName("modifiedAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar modifiedAt;
}
