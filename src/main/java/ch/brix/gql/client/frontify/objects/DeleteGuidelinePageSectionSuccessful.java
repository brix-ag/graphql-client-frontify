package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DeleteGuidelinePageSectionSuccessful {
  /**
   * **BETA** The id of the `Section` that was deleted.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
}
