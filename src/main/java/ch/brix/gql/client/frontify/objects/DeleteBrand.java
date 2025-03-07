package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DeleteBrand {
  /**
   * The deleted `Brand` id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
}
