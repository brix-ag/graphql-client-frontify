package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class ExportCreative {
  /**
   * **BETA** The newly created `CreativeJob`.
   */
  @com.google.gson.annotations.SerializedName("job")
  private ch.brix.gql.client.frontify.objects.CreativeExport job;
}
