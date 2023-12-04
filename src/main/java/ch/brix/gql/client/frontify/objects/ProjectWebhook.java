package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class ProjectWebhook implements ch.brix.gql.client.frontify.interfaces.Node, ch.brix.gql.client.frontify.interfaces.Webhook {
  /**
   * `Webhook` Id.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
  /**
   * The `creator` is the `User` who created the `Webhook`.
   */
  @com.google.gson.annotations.SerializedName("creator")
  private ch.brix.gql.client.frontify.interfaces.User creator;
  /**
   * DateTime of the `Webhook` creation.
   */
  @com.google.gson.annotations.SerializedName("createdAt")
  private ch.brix.gql.client.frontify.scalars.DateTimeScalar createdAt;
  /**
   * `Webhook` name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * The randomly generated secret of the current `Webhook`.
   */
  @com.google.gson.annotations.SerializedName("secret")
  private ch.brix.gql.client.frontify.scalars.StringScalar secret;
  /**
   * The `Url` which will be called by the `Webhook`
   */
  @com.google.gson.annotations.SerializedName("notificationUrl")
  private ch.brix.gql.client.frontify.scalars.UrlScalar notificationUrl;
  /**
   * Returns the associated `Project`.
   */
  @com.google.gson.annotations.SerializedName("project")
  private ch.brix.gql.client.frontify.unions.Project project;
}
