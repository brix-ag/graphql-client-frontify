package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateGuidelineDocument {
  /**
   * **BETA** The ID of the created document.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The title of the created document.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
}
