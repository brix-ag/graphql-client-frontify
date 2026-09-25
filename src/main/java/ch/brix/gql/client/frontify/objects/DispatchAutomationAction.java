package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class DispatchAutomationAction {
  /**
   * **BETA** The dispatched automation action event id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
}
