package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CancelExportCreatives {
  /**
   * A list of `CreativeJobs` that have been canceled successfully.
   */
  @com.google.gson.annotations.SerializedName("canceledJobs")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CreativeExport.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CreativeExport> canceledJobs;
}
