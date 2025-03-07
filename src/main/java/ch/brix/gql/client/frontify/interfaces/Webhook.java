package ch.brix.gql.client.frontify.interfaces;

/**
 * `WebhookInterface` for `Webhook` returnable types.
 */
@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.ProjectWebhook.class})
public interface Webhook {
  /**
   * `Workspace` Id.
   */
  ch.brix.gql.client.frontify.scalars.IdScalar getId();
  /**
   * The `creator` is the `User` who created the asset on Frontify.
   */
  ch.brix.gql.client.frontify.interfaces.User getCreator();
  /**
   * `DateTime` of the `Asset` creation.
   */
  ch.brix.gql.client.frontify.scalars.DateTimeScalar getCreatedAt();
  /**
   * The name of the current `Webhook`.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getName();
  /**
   * The `Url` which will be called by the `Webhook`.
   */
  ch.brix.gql.client.frontify.scalars.UrlScalar getNotificationUrl();
  /**
   * The randomly generated secret of the current `Webhook`.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getSecret();
}
