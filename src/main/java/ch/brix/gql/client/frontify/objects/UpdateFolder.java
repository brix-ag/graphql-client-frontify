package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateFolder {
  /**
   * `Folder` details.
   */
  @com.google.gson.annotations.SerializedName("folder")
  private ch.brix.gql.client.frontify.interfaces.Folder folder;
}
