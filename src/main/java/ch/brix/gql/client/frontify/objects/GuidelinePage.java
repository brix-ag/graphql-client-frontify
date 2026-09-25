package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class GuidelinePage {
  /**
   * **BETA** The `GuidelinePage` id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The title of the `GuidelinePage`
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
  /**
   * **BETA** The timestamp of the most recent modification to the `GuidelinePage` or its contents. If not modified, this represents the creation time.
   */
  @com.google.gson.annotations.SerializedName("modifiedAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar modifiedAt;
  /**
   * **BETA** The url of the `GuidelinePage`
   */
  @com.google.gson.annotations.SerializedName("url")
  private ch.brix.gql.client.frontify.scalars.UrlScalar url;
  /**
   * **BETA** A list of `GuidelinePageSection`s that belong to this `GuidelinePage`
   */
  @com.google.gson.annotations.SerializedName("sections")
  private ch.brix.gql.client.frontify.objects.GuidelinePageSectionItems sections;
}
