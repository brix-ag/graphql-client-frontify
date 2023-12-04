package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateLicense {
  /**
   * `License` details.
   */
  @com.google.gson.annotations.SerializedName("license")
  private ch.brix.gql.client.frontify.objects.License license;
}
