package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateGuidelineDocumentGroup {
  /**
   * **BETA** The ID of the updated document group.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * **BETA** The title of the document group after the update.
   */
  @com.google.gson.annotations.SerializedName("title")
  private ch.brix.gql.client.frontify.scalars.StringScalar title;
}
