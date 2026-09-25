package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class Target {
  /**
   * The unique identifier of the `Target`.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * The name of the `Target`.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
}
